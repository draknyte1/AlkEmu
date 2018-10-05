package jsnes;

final class dz extends afg {
   // $FF: synthetic field
   private kt a;

   private dz(kt var1, byte var2) {
      this.a = var1;
      super();
   }

   public final void a() {
      kt.a(this.a, 3);
      kt.e(this.a, kt.e(this.a) - 1 & '\uffff');
   }

   // $FF: synthetic method
   dz(kt var1) {
      this(var1, (byte)0);
   }
}
