package jsnes;

final class xe extends jp {
   // $FF: synthetic field
   private kt a;

   xe(kt var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "Stack Pointer";
   }

   final int a() {
      return 8;
   }

   final long a() {
      return (long)kt.d(this.a);
   }

   final void a(long var1) {
      kt.d(this.a, (int)var1 & 255);
   }
}
