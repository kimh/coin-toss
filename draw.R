# Rscript draw.R
ind = commandArgs(trailingOnly=TRUE)[1]
file = "coin-toss.png"

(x <- read.table("/tmp/coin-toss-result.txt", header=T))
png(file)
plot(x$avg, type="l")
dev.off()
browseURL(file)
