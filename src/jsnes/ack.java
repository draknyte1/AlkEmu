package jsnes;

final class ack extends afc {
   // $FF: synthetic field
   private adv a;

   private ack(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 11;
   }

   public final void a() {
      adv.o(this.a, this.a.c);
   }

   // $FF: synthetic method
   ack(adv var1) {
      this(var1, (byte)0);
   }
}
