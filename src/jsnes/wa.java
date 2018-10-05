package jsnes;

final class wa extends afc {
   // $FF: synthetic field
   private adv a;

   private wa(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      int var1 = adv.s(this.a);
      int var2 = adv.m(this.a, var1);
      this.a.b((var2 & this.a.c) == 0);
      var2 = (var2 | this.a.c) & 255;
      this.a.g();
      adv.i(this.a, var1, var2);
   }

   // $FF: synthetic method
   wa(adv var1) {
      this(var1, (byte)0);
   }
}
