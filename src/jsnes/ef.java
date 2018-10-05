package jsnes;

import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFormattedTextField.AbstractFormatterFactory;

final class ef extends AbstractFormatterFactory {
   // $FF: synthetic field
   private rd a;

   private ef(rd var1, byte var2) {
      this.a = var1;
      super();
   }

   public final AbstractFormatter getFormatter(JFormattedTextField var1) {
      return new hj(this.a);
   }

   // $FF: synthetic method
   ef(rd var1) {
      this(var1, (byte)0);
   }
}
