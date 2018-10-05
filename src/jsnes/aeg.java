package jsnes;

final class aeg extends afc {
   // $FF: synthetic field
   private adv a;

   private aeg(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      adv.P(this.a, this.a.c & 255);
   }

   // $FF: synthetic method
   aeg(adv var1) {
      this(var1, (byte)0);
   }
}
