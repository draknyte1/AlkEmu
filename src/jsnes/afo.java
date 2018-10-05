package jsnes;

final class afo extends afc {
   // $FF: synthetic field
   private adv a;

   private afo(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = -1;
   }

   public final void a() {
      this.a.b((this.a.c & adv.u(this.a)) == 0);
   }

   // $FF: synthetic method
   afo(adv var1) {
      this(var1, (byte)0);
   }
}
