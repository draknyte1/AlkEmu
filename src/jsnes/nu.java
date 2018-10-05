package jsnes;

final class nu extends afg {
   // $FF: synthetic field
   private kt a;

   private nu(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 31;
      this.b = 15;
   }

   public final void a() {
      int var1 = kt.r(this.a);
      int var2 = kt.g(this.a, var1) - 1 & 255;
      kt.a(this.a, var1, var2);
      kt.a(this.a, var2 != 0);
   }

   // $FF: synthetic method
   nu(kt var1) {
      this(var1, (byte)0);
   }
}
