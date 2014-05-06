package uk.co.jawc.scapoi

import org.apache.poi.xssf.usermodel.{XSSFRow, XSSFCell}
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell

/**
 * Created by James on 06/05/2014.
 */
object POIHelper {

  implicit class XSSFCellBuilder(cell: XSSFCell) {
    
    def value(text: String) = { cell.setCellValue(text); this }
  }

}

