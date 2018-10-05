package jsnes;

final class xh extends jp {
   // $FF: synthetic field
   private kt a;

   xh(kt var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "Index X";
   }

   final int a() {
      return 8;
   }

   final long a() {
      return (long)kt.b(this.a);
   }

   final void a(long var1) {
      kt.b(this.a, (int)var1 & 255);
   }
}
