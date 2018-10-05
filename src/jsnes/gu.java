package jsnes;

final class gu extends afg {
   // $FF: synthetic field
   private kt a;

   private gu(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 3;
   }

   public final void a() {
      kt.c(this.a, kt.b(this.a, kt.b(this.a) - 1 & 255));
      kt.a(this.a, 2);
   }

   // $FF: synthetic method
   gu(kt var1) {
      this(var1, (byte)0);
   }
}
