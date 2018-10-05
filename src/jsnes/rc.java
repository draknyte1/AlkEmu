package jsnes;

final class rc extends jp {
   // $FF: synthetic field
   private adv a;

   rc(adv var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "Data Bank";
   }

   final int a() {
      return 8;
   }

   final long a() {
      return (long)this.a.i;
   }

   final void a(long var1) {
      this.a.e((int)var1 & 255);
   }
}
