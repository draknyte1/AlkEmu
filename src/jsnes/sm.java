package jsnes;

final class sm extends afc {
   // $FF: synthetic field
   private adv a;

   private sm(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 11;
   }

   public final void a() {
      int var1 = adv.t(this.a);
      adv.f(this.a, this.a.j);
      this.a.f(adv.u(this.a));
      adv.g(this.a, this.a.h - 1 & '\uffff');
      this.a.g(var1);
      this.a.g();
      this.a.d();
   }

   // $FF: synthetic method
   sm(adv var1) {
      this(var1, (byte)0);
   }
}
