package com.example.shoposapi.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoposapi.R
import com.example.shoposapi.ui.theme.ShoposApiTheme
import org.w3c.dom.Text

@Composable
fun LoginScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .fillMaxWidth()
        .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        LogoShopos()
        TextGuide()
        Spacer(Modifier.height(18.dp))
        EmailField()
        Spacer(Modifier.height(18.dp))
        PswField()
        Spacer(Modifier.height(36.dp))
        LoginButton()
        Spacer(Modifier.height(18.dp))
        BioButton()
    }
}

@Composable
fun LogoShopos() {
    Image(
        painter = painterResource(R.drawable.logosophos),
        contentDescription = "Logo Sophos",
        contentScale = ContentScale.Fit,
        modifier = Modifier.size(width = 300.dp, height = 150.dp)
    )
}

@Composable
fun TextGuide() {
    Text(text = stringResource(R.string.indicacion),
        color = Color(0xFF7800FD),
        fontSize = 18.sp, fontWeight = FontWeight.W600,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(horizontal = 60.dp)
    )
}

@Composable
fun EmailField() {

    val correo: String = ""

    TextField(value = correo, onValueChange = {  },
        leadingIcon = { Icon(imageVector = Icons.Default.Mail,
            contentDescription = null, tint = Color(0xFF7800FD)
        ) },
        modifier = Modifier
            .fillMaxWidth()
            .border(
                2.dp, SolidColor(Color(0xFF7800FD)),
                MaterialTheme.shapes.large
            ),
        placeholder = { Text(text = stringResource(R.string.correo),
            color = Color(0xFF7800FD)
        ) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFF7800FD),
            backgroundColor = Color.White,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@Composable
fun PswField() {

    val password: String = ""

    TextField(value = password, onValueChange = {  },
        leadingIcon = { Icon(imageVector = Icons.Default.VpnKey,
            contentDescription = null, tint = Color(0xFF7800FD)
        ) },
        trailingIcon = { Icon(imageVector = Icons.Default.Visibility,
            contentDescription = null, tint = Color(0xFF7800FD)
        ) },
        modifier = Modifier
            .fillMaxWidth()
            .border(
                2.dp, SolidColor(Color(0xFF7800FD)),
                MaterialTheme.shapes.large
            ),
        placeholder = { Text(text = stringResource(R.string.contrasena),
            color = Color(0xFF7800FD) )},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xFF7800FD),
            backgroundColor = Color.White,
            focusedLabelColor = Color(0xFF7800FD),
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@Composable
fun LoginButton() {
    Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        shape = MaterialTheme.shapes.large
    ) {
        Text(text = stringResource(R.string.ingresar),
            fontSize = 18.sp
        )
    }
}

@Composable
fun BioButton() {
    OutlinedButton(onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White,
            contentColor = Color(0xFF7800FD) ),
        border = BorderStroke(2.dp, color = Color(0xFF7800FD) ),
        shape = MaterialTheme.shapes.large
    ) {
        Icon(painterResource(R.drawable.fingerprint), contentDescription = null)
        Spacer(modifier = Modifier.width(24.dp))
        Text(text = stringResource(R.string.ingresar_bm),
            fontSize = 18.sp
        )
    }
}








@Preview(showSystemUi = true)
@Composable
fun LoginPreview() {
    ShoposApiTheme() {
        LoginScreen()
    }
}

@Preview(showSystemUi = true)
@Composable
fun ImgPreview() {
    LogoShopos()
}