package jsnes;

final class wf extends afc {
   // $FF: synthetic field
   private adv a;

   private wf(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
   }

   public final void a() {
      adv.A(this.a, adv.O(this.a));
   }

   // $FF: synthetic method
   wf(adv var1) {
      this(var1, (byte)0);
   }
}
