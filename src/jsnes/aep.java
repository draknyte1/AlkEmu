package jsnes;

final class aep extends afc {
   // $FF: synthetic field
   private adv a;

   private aep(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 12;
   }

   public final void a() {
      adv.v(this.a, this.a.c);
   }

   // $FF: synthetic method
   aep(adv var1) {
      this(var1, (byte)0);
   }
}
