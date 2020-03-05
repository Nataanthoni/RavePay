package com.killasites.ravepay

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.flutterwave.raveandroid.RaveConstants
import com.flutterwave.raveandroid.RavePayActivity
import com.flutterwave.raveandroid.RavePayManager
import kotlinx.android.synthetic.main.activity_pay_now.*


private const val key = "a0ade2aed616589f2fdb43a6"
private const val publickey = "FLWPUBK-2422c1fe613719718b4b839bae09edae-X"

class PayNow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay_now)

        makepayments.setOnClickListener {
            makePayments()
        }
    }

    private fun makePayments(){
        RavePayManager(this)
            .setAmount(2780.toDouble())
            .setCountry("UGA")
            .setCurrency("UGX")
            .setCountry("Uganda")
            .setEmail("some@email.com")
            .setlName("Anthony")
            .setNarration("Nata")
            .setPublicKey(publickey)
            .setEncryptionKey(key)
            .setTxRef("29829")
            .setPhoneNumber(phonenumber.toString())
            .acceptAccountPayments(false)
            .acceptCardPayments(true)
            .acceptAchPayments(true)
            .acceptUgMobileMoneyPayments(true)
            .acceptUssdPayments(true)
            .allowSaveCardFeature(false)
            .onStagingEnv(false)
            .isPreAuth(false)
            .shouldDisplayFee(true)
            .showStagingLabel(true)
            .initialize()
    }

    override fun onActivityResult(
        requestCode: Int,
        resultCode: Int,
        data: Intent?
    ) { /*
     *  We advise you to do a further verification of transaction's details on your server to be
     *  sure everything checks out before providing service or goods.
    */
        if (requestCode == RaveConstants.RAVE_REQUEST_CODE && data != null) {
            val message = data.getStringExtra("response")
            if (resultCode == RavePayActivity.RESULT_SUCCESS) {
                Toast.makeText(this, "SUCCESS $message", Toast.LENGTH_SHORT).show()
            } else if (resultCode == RavePayActivity.RESULT_ERROR) {
                Toast.makeText(this, "ERROR $message", Toast.LENGTH_SHORT).show()
            } else if (resultCode == RavePayActivity.RESULT_CANCELLED) {
                Toast.makeText(this, "CANCELLED $message", Toast.LENGTH_SHORT).show()
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }


}
