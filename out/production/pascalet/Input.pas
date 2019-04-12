program Input;

{integer global vars}
{i is used as an iterator}
var someint, i : integer;

{boolea global vars}
var somebool : boolean;

{increment a given parameter and return the value}
function increment(number:integer) : integer;
    begin
        increment := number + 1;
    end;


{takes 3 strings and prints them in a letter structure}
procedure sendLetter(name:string; msg:string; closing:string);
    var spacing: integer;

    begin
        { margin width }
        spacing := 4;

        { top margin }
        for i := 0 to spacing do
            begin
                WriteLn('');
            end;

        WriteLn('Dear ', name, ',');
        writeln('');
        WriteLn(msg);
        WriteLn('');
        WriteLn('Regards,');
        WriteLn(closing);


        { bottom margin }
        for i := 0 to spacing do
        begin
            WriteLn('');
        end;
    end;




begin
    someint := 3 * 2;
    someint := 3 / 2;
    someint := 3 mod 2;
    somebool := 3 * 2 = 6;
    somebool := 3 * 2 = 7;
    somebool := (3 * 2 = 6) and (3 * 2 = 7);

    { 'wow' }
    { someint }
    { 1 }
    WriteLn('wow' + ' ', (-2 + 5) + ' ', true = someint = someint);

    if (someint < 5) then
    begin
        for i := 0 to 5 do
            begin
                Write('looping: ');
                WriteLn('iterator = ' + i);
            end;
    end;

    senDLetter('Patrick',
                  'This is a letter to say to say goodbye.',
                  'Spongebob'
                  );

    increment(1);

    Write(increment);

    writeln(increment);

end.