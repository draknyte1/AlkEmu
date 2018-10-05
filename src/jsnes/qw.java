package jsnes;

final class qw extends jp {
   // $FF: synthetic field
   private adv a;

   qw(adv var1) {
      this.a = var1;
      super();
   }

   final String a() {
      return "Stack Pointer";
   }

   final int a() {
      return 16;
   }

   final long a() {
      return (long)this.a.g;
   }

   final void a(long var1) {
      this.a.g = (int)var1 & '\uffff';
   }
}
