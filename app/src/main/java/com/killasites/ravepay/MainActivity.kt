package com.killasites.ravepay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.flutterwave.raveandroid.Meta
import com.flutterwave.raveandroid.RaveConstants.yes
import com.flutterwave.raveandroid.RavePayManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val setCountry = (country)
            val currency = currency
            .setEmail(email)
            .setfName(fName)
            .setlName(lName)
            .setNarration(narration)
            .setPublicKey(publicKey)
            .setEncryptionKey(encryptionKey)
            .setTxRef(txRef)
            .setPhoneNumber(phoneNumber)
            .acceptAccountPayments(boolean)
            .acceptCardPayments(boolean)
            .acceptMpesaPayments(boolean)
            .acceptAchPayments(boolean)
            .acceptGHMobileMoneyPayments(boolean)
            .acceptUgMobileMoneyPayments(boolean)
            .acceptZmMobileMoneyPayments(boolean)
            .acceptRwfMobileMoneyPayments(boolean)
            .acceptUkPayments(boolean)
            .acceptBankTransferPayments(boolean)
            .acceptUssdPayments(boolean)
            .acceptBarterPayments(boolean)
            .acceptFrancMobileMoneyPayments(boolean)
            .allowSaveCardFeature(boolean)
            .onStagingEnv(boolean)
            .setMeta(List<Meta>)
            .withTheme(styleId)
            .isPreAuth(boolean)
            .setSubAccounts(List<SubAccount>)
            .shouldDisplayFee(boolean)
            .showStagingLabel(yes)
            .initialize()


         RavePayManager(this@MainActivity).setAmount(amount2)
            .setCountry(country)
            .setCurrency(currency)
            .setEmail(email)
            .setfName(fName)
            .setlName(lName)
            .setNarration(narration)
            .setPublicKey(publicKey)
            .setEncryptionKey(encryptionKey)
            .setTxRef(txRef)
            .setPhoneNumber(phoneNumber)
            .acceptAccountPayments(boolean)
            .acceptCardPayments(boolean)
            .acceptMpesaPayments(boolean)
            .acceptAchPayments(boolean)
            .acceptGHMobileMoneyPayments(boolean)
            .acceptUgMobileMoneyPayments(boolean)
            .acceptZmMobileMoneyPayments(boolean)
            .acceptRwfMobileMoneyPayments(boolean)
            .acceptUkPayments(boolean)
            .acceptBankTransferPayments(boolean)
            .acceptUssdPayments(boolean)
            .acceptBarterPayments(boolean)
            .acceptFrancMobileMoneyPayments(boolean)
            .allowSaveCardFeature(boolean)
            .onStagingEnv(boolean)
            .setMeta(List<Meta>)
            .withTheme(styleId)
            .isPreAuth(boolean)
            .setSubAccounts(List<SubAccount>)
            .shouldDisplayFee(boolean)
            .showStagingLabel(yes)
            .initialize()
    }


}
