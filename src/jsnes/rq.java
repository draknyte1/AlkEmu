package jsnes;

final class rq extends afc {
   // $FF: synthetic field
   private adv a;

   private rq(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 21;
   }

   public final void a() {
      adv.a(this.a, !this.a.b());
   }

   // $FF: synthetic method
   rq(adv var1) {
      this(var1, (byte)0);
   }
}
