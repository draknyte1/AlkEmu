package jsnes;

import javax.swing.JFormattedTextField.AbstractFormatter;

final class hj extends AbstractFormatter {
   // $FF: synthetic field
   private rd a;

   private hj(rd var1, byte var2) {
      this.a = var1;
      super();
   }

   public final Object stringToValue(String var1) {
      return Long.valueOf(var1, 16).longValue() & this.a.a;
   }

   public final String valueToString(Object var1) {
      String var2 = "";
      if (var1 != null) {
         var2 = Long.toHexString(((Long)var1).longValue() & this.a.a).toUpperCase();
      }

      while(var2.length() < (this.a.a + 3) / 4) {
         var2 = "0" + var2;
      }

      return var2;
   }

   // $FF: synthetic method
   hj(rd var1) {
      this(var1, (byte)0);
   }
}
