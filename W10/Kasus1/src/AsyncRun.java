public class AsyncRun implements Runnable {
  @Override
  public void run() {
      try{
        // TODO Auto-generated method stub
    System.out.println("AsyncRun.run on thread " + Thread.currentThread().getId());
    throw new ArithmeticException();
      }catch(Exception e){
          System.out.println(e.getClass().getName() + " handled");
      }
  }    

public static void main( String[] args ) {
  try {
    Thread t = new Thread(new AsyncRun());
    t.start();
    System.out.println( "main on thread " + Thread.currentThread().getId());
    throw new NullPointerException();
  }
  catch(Exception ex)
  {
    System.out.println(ex.getClass().getName() + " handled");
  }
}
}
