package jsnes;

final class xb extends jp {
   // $FF: synthetic field
   private kt a;

   xb(kt var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "Program Counter";
   }

   final int a() {
      return 16;
   }

   final long a() {
      return (long)kt.e(this.a);
   }

   final void a(long var1) {
      kt.e(this.a, (int)var1 & '\uffff');
   }
}
