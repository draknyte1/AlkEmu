package jsnes;

final class ov extends afg {
   // $FF: synthetic field
   private kt a;

   private ov(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 15;
   }

   public final void a() {
      int var1 = kt.r(this.a);
      int var2 = kt.j(this.a, var1) + 1 & '\uffff';
      kt.d(this.a, var1, var2);
      kt.e(this.a, var2);
      kt.a(this.a, 6);
   }

   // $FF: synthetic method
   ov(kt var1) {
      this(var1, (byte)0);
   }
}
