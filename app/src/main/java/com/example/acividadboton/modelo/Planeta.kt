package com.example.acividadboton.modelo

import android.os.Parcel
import android.os.Parcelable

data class Planeta(
    var nombre: String?,
    var superficie:Float,
    var diaSemana: String?,
    var energia:Boolean) : Parcelable {


    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readFloat(),
        parcel.readString(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeFloat(superficie)
        parcel.writeString(diaSemana)
        parcel.writeByte(if (energia) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Planeta> {
        override fun createFromParcel(parcel: Parcel): Planeta {
            return Planeta(parcel)
        }

        override fun newArray(size: Int): Array<Planeta?> {
            return arrayOfNulls(size)
        }
    }
}