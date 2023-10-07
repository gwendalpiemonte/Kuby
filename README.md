# Kuby : Image generator with a media


## Description
In this project you will find an implementation of a CLI tool that can create an image based on a media.

### If time permits
We would like to implement a music analysing tool that read all the bytes of a music and influence the seed to generate an image.


## Installation
blablabla


## Usage
In this CLI we have two main command the first one to make a conversion from a text to an image
and the second one from a music to an image.


## Commands

### Sentance -> Image

```sh
java -jar <path-to-jar> text <inputFile> <outputFile>
```

### Music -> Image

```sh
java -jar <path-to-jar> music <inputFile> <outputFile>
```

### Parameters

- `-i ,--input  <outputFile>`: Path to the input file (the one who contain the media we want to converse).
- `-o ,--output   <outputFile>`: Path to the folder where the image will be generated.

### Options
If we don't use the options there is default value for each of them :
- `-c ,--color  <color> Values = [blue, green, yellow, red, random]`[Optional]    
  Specifies the main color of the generated image.   
  Default value -> random


- `-h ,--height <color>`: [Optional]   
  Specifies the height of the generated image in pixels   
  Default value -> 100


- `-w ,--width  <color>`: [Optional]   
  Specifies the width of the generated image in pixels.   
  Default value -> 100


## Examples

### Conversion from a text to an image (default value).
```sh
java -jar kuby.jar text -i input.txt -o output
```
### Conversion from a music to a yellow image with a height of 100 and a width of 200.

```sh
java -jar kuby.jar music -i input.txt -o output -c yellow -h 100 -w 200
```


## Return Codes

blablabla

