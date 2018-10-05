package jsnes;

final class si extends jw {
   // $FF: synthetic field
   private us a;

   public si(us var1) {
      this.a = var1;
      super(127);
   }

   public final int b(int var1) {
      this.a.k += 8;
      return this.a.a[65536 | var1] & 255;
   }

   public final int a(int var1) {
      return this.a.a[65536 | var1] & 255;
   }

   public final void a(int var1, int var2) {
      this.a.k += 8;
      this.a.a[65536 | var1] = (byte)var2;
   }
}
