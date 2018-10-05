package jsnes;

final class sj extends jw {
   // $FF: synthetic field
   private us a;

   public sj(us var1) {
      this.a = var1;
      super(126);
   }

   public final int b(int var1) {
      this.a.k += 8;
      return this.a.a[var1] & 255;
   }

   public final int a(int var1) {
      return this.a.a[var1] & 255;
   }

   public final void a(int var1, int var2) {
      this.a.k += 8;
      this.a.a[var1] = (byte)var2;
   }
}
