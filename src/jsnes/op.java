package jsnes;

final class op extends aei {
   // $FF: synthetic field
   private adv a;

   op(adv var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "Memory Select";
   }

   final String b() {
      return "M";
   }

   final boolean a() {
      return this.a.g;
   }

   final void a(boolean var1) {
      this.a.g = var1;
      this.a.m();
   }
}
