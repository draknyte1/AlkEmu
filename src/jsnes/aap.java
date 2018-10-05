package jsnes;

final class aap extends afc {
   // $FF: synthetic field
   private adv a;

   private aap(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 19;
   }

   public final void a() {
      adv.R(this.a, this.a.c & 255);
   }

   // $FF: synthetic method
   aap(adv var1) {
      this(var1, (byte)0);
   }
}
