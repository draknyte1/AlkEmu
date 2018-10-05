package jsnes;

final class up extends afc {
   // $FF: synthetic field
   private adv a;

   private up(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 2;
   }

   public final void a() {
      this.a.c = adv.f(this.a, this.a.c);
      this.a.g();
   }

   // $FF: synthetic method
   up(adv var1) {
      this(var1, (byte)0);
   }
}
