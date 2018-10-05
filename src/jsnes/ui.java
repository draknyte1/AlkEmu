package jsnes;

final class ui extends afc {
   // $FF: synthetic field
   private adv a;

   private ui(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = -1;
   }

   public final void a() {
      adv.e(this.a, adv.l(this.a));
   }

   // $FF: synthetic method
   ui(adv var1) {
      this(var1, (byte)0);
   }
}
