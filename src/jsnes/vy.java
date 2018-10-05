package jsnes;

final class vy {
   public final byte[] a;
   public int a;
   public int b;
   public boolean a;

   public vy(byte[] var1) {
      this(var1, 0);
   }

   public vy(byte[] var1, int var2) {
      this.a = var1;
      this.a = var2;
   }

   public final void a(int var1) {
      this.b += var1;
   }

   public final int a(int var1) {
      return this.a[this.a + var1] & 255;
   }

   public final int a() {
      return this.a(this.b++);
   }

   public final boolean a() {
      return this.a() != 0;
   }

   public final int b() {
      return this.a ? this.a() << 8 | this.a() : this.a() | this.a() << 8;
   }

   public final int c() {
      return this.a ? this.a() << 24 | this.a() << 16 | this.a() << 8 | this.a() : this.a() | this.a() << 8 | this.a() << 16 | this.a() << 24;
   }

   public final String a(int var1) {
      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = (char)this.a();
      }

      return new String(var2);
   }

   public final void a(byte[] var1) {
      this.a(var1, 0, var1.length);
   }

   public final void a(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var2 + var3; ++var4) {
         var1[var4] = (byte)this.a();
      }

   }
}
