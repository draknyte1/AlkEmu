package jsnes;

final class ady extends afc {
   // $FF: synthetic field
   private adv a;

   private ady(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 21;
   }

   public final void a() {
      adv.a(this.a, this.a.h);
   }

   // $FF: synthetic method
   ady(adv var1) {
      this(var1, (byte)0);
   }
}
