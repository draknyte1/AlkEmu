package jsnes;

final class iw extends afg {
   // $FF: synthetic field
   private kt a;

   private iw(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 31;
      this.b = 23;
   }

   public final void a() {
      kt.a(this.a, 3);
      kt.a(this.a, (kt.h(this.a) & 1) != 0);
   }

   // $FF: synthetic method
   iw(kt var1) {
      this(var1, (byte)0);
   }
}
