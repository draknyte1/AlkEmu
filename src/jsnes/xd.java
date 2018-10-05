package jsnes;

final class xd extends jp {
   // $FF: synthetic field
   private kt a;

   xd(kt var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "Index Y";
   }

   final int a() {
      return 8;
   }

   final long a() {
      return (long)kt.c(this.a);
   }

   final void a(long var1) {
      kt.c(this.a, (int)var1 & 255);
   }
}
