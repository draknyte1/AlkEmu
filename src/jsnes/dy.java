package jsnes;

final class dy extends bv {
   // $FF: synthetic field
   private us a;

   public dy(us var1, int var2) {
      this.a = var1;
      super(var2, (var2 & 127) - 64 << 16);
   }

   public final int a(int var1) {
      return this.a.b(this.a + var1);
   }

   public final int b(int var1) {
      this.a.k += this.b;
      return this.a.a(this.a + var1);
   }

   public final void a(int var1, int var2) {
      this.a.k += this.b;
   }
}
