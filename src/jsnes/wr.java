package jsnes;

final class wr extends aei {
   // $FF: synthetic field
   private kt a;

   wr(kt var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "Direct Page";
   }

   final String b() {
      return "P";
   }

   final boolean a() {
      return kt.f(this.a) != 0;
   }

   final void a(boolean var1) {
      kt.f(this.a, var1 ? 256 : 0);
   }
}
