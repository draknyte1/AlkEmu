package jsnes;

abstract class afg {
   public int a;
   public int b;

   private afg(byte var1) {
      this.a = 1;
      this.b = 1;
   }

   public abstract void a();

   // $FF: synthetic method
   afg() {
      this((byte)0);
   }
}
