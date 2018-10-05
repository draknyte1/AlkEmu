package jsnes;

abstract class bv extends jw {
   protected final int a;
   protected int b;

   public bv(int var1, int var2) {
      super(var1);
      this.a = var2;
      this.b = 8;
   }

   public final void a(int var1) {
      this.b = var1;
   }
}
