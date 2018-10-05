package jsnes;

final class ado extends afc {
   // $FF: synthetic field
   private adv a;

   private ado(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 23;
   }

   public final void a() {
      this.a.b(2);
      this.a.j(this.a.e = adv.A(this.a));
   }

   // $FF: synthetic method
   ado(adv var1) {
      this(var1, (byte)0);
   }
}
