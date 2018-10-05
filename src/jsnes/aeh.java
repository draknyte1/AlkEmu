package jsnes;

final class aeh extends Thread {
   // $FF: synthetic field
   private afi a;

   aeh(afi var1, String var2) {
      this.a = var1;
      super(var2);
   }

   public final void run() {
      afi.a(this.a);
   }
}
