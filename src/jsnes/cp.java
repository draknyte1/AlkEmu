package jsnes;

final class cp extends afc {
   // $FF: synthetic field
   private adv a;

   private cp(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 14;
   }

   public final void a() {
      int var1 = adv.r(this.a);
      int var2 = adv.d(this.a, var1) + 1 & '\uffff';
      this.a.j(var2);
      this.a.g();
      adv.c(this.a, var1, var2);
   }

   // $FF: synthetic method
   cp(adv var1) {
      this(var1, (byte)0);
   }
}
