/*
This program prints the number of seconds that have elapsed since the
program was reset.
*/
void setup(){
    Serial.begin(9600);
}
void loop(){
    delay(1000);
    Serial.print(millis()/1000);
    Serial.println(" sec have elapsed");
}

