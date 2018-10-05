package jsnes;

final class dx extends afg {
   // $FF: synthetic field
   private kt a;

   private dx(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 31;
      this.b = 4;
   }

   public final void a() {
      int var1 = kt.c(this.a) - 1 & 255;
      kt.c(this.a, var1);
      kt.a(this.a, var1 != 0);
   }

   // $FF: synthetic method
   dx(kt var1) {
      this(var1, (byte)0);
   }
}
