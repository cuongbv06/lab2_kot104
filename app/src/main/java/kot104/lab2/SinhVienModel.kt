package kot104.lab2

class SinhVienModel {
    var tenSV: String = ""
    var mssv: String = ""
    var diemTB: Float = 0.0f
    var daTotNghiep: Boolean? = null
    var tuoi: Int? = null

    constructor(tenSV: String, mssv: String, diemTB: Float, daTotNghiep: Boolean?, tuoi: Int?) {
        this.tenSV = tenSV
        this.mssv = mssv
        this.diemTB = diemTB
        this.daTotNghiep = daTotNghiep
        this.tuoi = tuoi
    }

    constructor() // constructor mặc định

    override fun toString(): String {
        return "Tên SV: $tenSV, MSSV: $mssv, Điểm TB: $diemTB, Đã tốt nghiệp: $daTotNghiep, Tuổi: $tuoi"
    }
}
