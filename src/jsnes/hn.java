package jsnes;

final class hn extends afc {
   // $FF: synthetic field
   private adv a;

   private hn(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 12;
   }

   public final void a() {
      adv.S(this.a, this.a.c & 255);
   }

   // $FF: synthetic method
   hn(adv var1) {
      this(var1, (byte)0);
   }
}
