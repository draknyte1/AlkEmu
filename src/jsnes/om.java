package jsnes;

final class om extends aei {
   // $FF: synthetic field
   private adv a;

   om(adv var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "IRQ Disable";
   }

   final boolean a() {
      return this.a.d;
   }

   final void a(boolean var1) {
      this.a.d = var1;
   }
}
