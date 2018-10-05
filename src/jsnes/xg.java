package jsnes;

final class xg extends jp {
   // $FF: synthetic field
   private kt a;

   xg(kt var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "Accumulator";
   }

   final int a() {
      return 8;
   }

   final long a() {
      return (long)kt.a(this.a);
   }

   final void a(long var1) {
      kt.a(this.a, (int)var1 & 255);
   }
}
