package jsnes;

final class aea extends afc {
   // $FF: synthetic field
   private adv a;

   private aea(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 16;
   }

   public final void a() {
      adv.a(this.a, adv.h(this.a));
   }

   // $FF: synthetic method
   aea(adv var1) {
      this(var1, (byte)0);
   }
}
