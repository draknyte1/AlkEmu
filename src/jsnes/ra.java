package jsnes;

final class ra extends jp {
   // $FF: synthetic field
   private adv a;

   ra(adv var1) {
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
      return (long)this.a.h;
   }

   final void a(long var1) {
      this.a.g((int)var1 & '\uffff');
   }
}
