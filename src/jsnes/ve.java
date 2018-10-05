package jsnes;

final class ve extends dk {
   private xx a;

   public ve(xx var1) {
      this.a = var1;
      this.a = 65535;
   }

   public final int a() {
      return 65535;
   }

   public final int a(int var1) {
      xx var2 = this.a;
      return (var1 & 1) == 0 ? var2.a[var1 >> 1] & 255 : var2.a[var1 >> 1] >> 8 & 255;
   }
}
